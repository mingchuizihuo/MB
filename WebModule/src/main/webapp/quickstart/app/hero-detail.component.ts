import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Params }   from '@angular/router';
import { Location }                 from '@angular/common';
import { Hero }                     from './hero';
import { HeroService } from './hero.service';
import 'rxjs/add/operator/switchMap';

@Component({
		moduleId: module.id,
  	selector: 'my-hero-detail',
  	templateUrl: 'hero-detail.component.html',
		styleUrls:['hero-detail.component.css'],
	})


export class HeroDetailComponent implements OnInit{
	  @Input()
	  heroe:Hero;
	  ngOnInit(): void {
		    this.route.params
		    .switchMap((params: Params) => this.heroService.getHero(+params['id']))
		    .subscribe(hero => this.heroe = hero);
		}
  	
  	constructor(
		  private heroService: HeroService,
		  private route: ActivatedRoute,
		  private location: Location
		) {}
		
		goBack(): void {
		  this.location.back();
		}
		save(): void {
		  this.heroService.update(this.heroe)
		    .then(() => this.goBack());
		}
	}